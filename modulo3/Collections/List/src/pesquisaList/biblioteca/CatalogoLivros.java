package pesquisaList.biblioteca;

import java.util.ArrayList;
import java.util.List;


public class CatalogoLivros {
	
	public static void main(String[] args) {
		CatalogoLivros catalogo = new CatalogoLivros();
		
		catalogo.adicionarLivro("Sempre de Férias 1", "Jonas", 1997);
		catalogo.adicionarLivro("Sempre de Férias 2", "Jonas", 2001);
		catalogo.adicionarLivro("Sempre de Férias 3", "Jonas", 2003);
		catalogo.adicionarLivro("Sempre de Férias 4", "Jonas", 2005);
		
		//System.out.println(catalogo.pesquisarPorAutor("Jonas"));
		//System.out.println(catalogo.pesquisarPorIntervaloAnos(1998, 2003));
		try {
			System.out.println(catalogo.pesquisarPorTitulo("sempre de Férias"));
		}catch(ExceptionNulo e) {
			System.out.println("Livro não encontrado !");
		}
	}
	
	
	private List<Livro> catalogoLivros;
	
	public CatalogoLivros() {
		this.catalogoLivros = new ArrayList<>();
	}
	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		catalogoLivros.add(new Livro(titulo, autor, anoPublicacao));
	}
	
	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> livrosPorAutor = new ArrayList<>();
		
		//verifica se a lista não está vazia
		if(!catalogoLivros.isEmpty()) {
			for(Livro l : catalogoLivros) {
				if(l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
				}
			}
			return livrosPorAutor;
		}else
			throw new RuntimeException("A lista está vazia");
		
	}
	
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
		List<Livro> livrosIntervaloAnos = new ArrayList<>();
		if(!catalogoLivros.isEmpty()) {
			for(Livro l : catalogoLivros) {
				if(l.getAnoPublicacao() >= anoInicial & l.getAnoPublicacao() <= anoFinal) {
					livrosIntervaloAnos.add(l);
				}
			}
			return livrosIntervaloAnos;
		}else
			throw new RuntimeException("A lista está vazia");
	}
	
	public Livro pesquisarPorTitulo(String titulo) throws ExceptionNulo{
		Livro livroPorTitulo = null;
		if(!catalogoLivros.isEmpty()) {
			for(Livro l : catalogoLivros) {
				
				if(l.getTitulo().equalsIgnoreCase(titulo)) {
					livroPorTitulo = l;
					break;
				}
			}
			if(livroPorTitulo == null) {
				throw new ExceptionNulo();
			}else
				return livroPorTitulo;
		}else
			throw new RuntimeException("A lista está vazia");
	}
	
	/* 
	 * Retorna todos os livros que possuem parte do titulo
	public List<Livro> pesquisarPorTitulo(String titulo){
		List<Livro> livrosPorTitulo = new ArrayList<>();
		
		if(!catalogoLivros.isEmpty()) {
			for(Livro l : catalogoLivros) {
				if(l.getTitulo().contains(titulo)){
					livrosPorTitulo.add(l);
				}
			}
			return livrosPorTitulo;
		}
		return livrosPorTitulo;
	}*/
}
