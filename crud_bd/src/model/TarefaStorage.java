package model;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TarefaStorage {

	public static void inserir(Tarefa tarefa) {
		final String query = "INSERT INTO tarefa (nome, descricao) VALUES (?, ?)";

		Connection conn = null;
		PreparedStatement prepStmt = null;
		ResultSet rs = null;

		try {
			conn = ConexaoFactory.getConexao();

			prepStmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
			prepStmt.setString(1, tarefa.getNome());
			prepStmt.setString(2, tarefa.getDescricao());
			prepStmt.execute();

			rs = prepStmt.getGeneratedKeys();
			if (rs.next()) {
				tarefa.setId(rs.getInt(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (prepStmt != null)
					prepStmt.close();

				if (rs != null)
					rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	} // fim do método inserir(Tarefa)

	public static void atualizar(Tarefa tarefa) {
		final String query = "UPDATE tarefa SET nome = ?, descricao = ? WHERE id = ?";

		Connection conn = null;
		PreparedStatement prepStmt = null;

		try {
			conn = ConexaoFactory.getConexao();

			prepStmt = conn.prepareStatement(query);
			prepStmt.setString(1, tarefa.getNome());
			prepStmt.setString(2, tarefa.getDescricao());
			prepStmt.setInt(3, tarefa.getId());
			prepStmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (prepStmt != null)
					prepStmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	} // fim do método atualizar(Tarefa)

	public static void remover(Tarefa tarefa) {
		final String query = "DELETE FROM tarefa WHERE id = ?";

		Connection conn = null;
		PreparedStatement prepStmt = null;

		try {
			conn = ConexaoFactory.getConexao();

			prepStmt = conn.prepareStatement(query);
			prepStmt.setInt(1, tarefa.getId());
			prepStmt.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (prepStmt != null)
					prepStmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	} // fim do método remover(Tarefa)

	public static List<Tarefa> listar() {
		List<Tarefa> tarefas = new ArrayList<>();

		final String query = "SELECT * FROM tarefa ORDER BY Id";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = ConexaoFactory.getConexao();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);

			while (rs.next()) {
				Tarefa tarefa = new Tarefa();
				tarefa.setId(rs.getInt("id"));
				tarefa.setNome(rs.getString("nome"));
				tarefa.setDescricao(rs.getString("descricao"));

				tarefas.add(tarefa);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (stmt != null)
					stmt.close();

				if (rs != null)
					rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return tarefas;
	} // fim do método listar()

} // fim da classe TarefaStorage
