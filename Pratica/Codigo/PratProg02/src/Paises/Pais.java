package Paises;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Pais {
	int id;
	String nome;
	long populacao;
	double area;

	public Pais () {}
	
	public Pais( int id, String nome, long populacao, double area) {
		setId(id);
		setNome(nome);
		setPopulacao(populacao);
		setArea(area);
	}
	// Gets e Sets
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getPopulacao() {
		return populacao;
	}
	public void setPopulacao(long populacao) {
		this.populacao = populacao;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "ID: " + id + " Nome: " + nome + "População: " + populacao + "Area: " + area;
	}
	
	//CRUD
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
		throw new RuntimeException(e);
		}
	}
	public Connection obtemConexao() throws SQLException {
		return DriverManager
				.getConnection("jdbc:mysql://localhost/Pais?user=alunos&password=alunos");
	}
	
	// INCLUIR
	public void incluir(int id, String nome, long populacao, double area) {
	String sql = "INSERT INTO Pais(id, nome, populacao, area) VALUES (?, ?, ?, ?)";
			try (Connection conn = obtemConexao();
		PreparedStatement stm = conn.prepareStatement(sql);) {
		stm.setInt   (1, id);
		stm.setString(2, nome);
		stm.setLong  (3, populacao);
		stm.setDouble(4, area);
	stm.execute();
		} catch (SQLException e) {
		e.printStackTrace();
	}
	}
	//Update
	public void atualizar(int id, String nome, long populacao, double area) {
	String sql = "UPDATE Pais SET nome=?, area=?, populacao=? WHERE id=?";
		    try (Connection conn = obtemConexao();
	PreparedStatement stm = conn.prepareStatement(sql);) {
		stm.setInt   (1, id);
		stm.setString(2, nome);
		stm.setLong  (3, populacao);
		stm.setDouble(4, area);
		stm.execute();
		} catch (Exception e) {
		e.printStackTrace();
	}
	}
	//Delete
	public void excluir(int id){
		String sql = "DELETE FROM Pais WHERE id = ?";
			try(Connection conn = obtemConexao();
		PreparedStatement stm = conn.prepareStatement(sql);) {
			stm.setInt   (1, id);
			stm.execute  ();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	//maiorPopulação
	public void maiorPopulacao() {
		String sql = "SELECT * FROM Pais WHERE populacao = (SELECT MAX(populacao) FROM Pais)";
		try (Connection conn = obtemConexao()){
			PreparedStatement stm = conn.prepareStatement(sql);	
			ResultSet rs = stm.executeQuery();
			if(rs.next()) {
				setNome(rs.getString("nome"));
				setPopulacao(rs.getLong("populacao"));
				setId(rs.getInt("id"));
				setArea(rs.getDouble("area"));
			}else {
				System.out.println("Error Result Set");
			}
			
		}catch (SQLException e) {
			System.out.println(e);
		}
	}
	//menorArea
	public void menorArea() {
		String get = "SELECT * FROM pais WHERE area = (SELECT Min(area) FROM Pais)";
		try (Connection conn = obtemConexao()){
			PreparedStatement stm = conn.prepareStatement(get);
			ResultSet rs = stm.executeQuery();
			if(rs.next()) {
				setNome(rs.getString    ("nome"));
				setPopulacao(rs.getLong ("populacao"));
				setId(rs.getInt			("id"));
				setArea(rs.getDouble    ("area"));
			}else {
				System.out.println("ERROR RESULT SET");
			}
		}catch (SQLException e) {
			System.out.println(e);
		}
	}
	//vetorPaises
	public String[] vetorPaises() {	
		String get = "SELECT nome FROM paises ORDER BY nome";
		String[] array = new String[3];
		int cont = 0 ;
		try (Connection conn = obtemConexao()){
			PreparedStatement stm = conn.prepareStatement(get);
			ResultSet rs = stm.executeQuery();
			while(rs.next() && cont < 3 ) {
				array[cont] = rs.getString("nome");
				cont ++;
			}
		}catch (SQLException e) {
			System.out.println(e);
		}	
		return array;
	}
	}