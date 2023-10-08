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
			System.out.println(catalogo.pesquisarPorTitulo("Sempre de Férias"));
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
	
	public List<Livro> pesquisarPorAutor(String autor) throws ExceptionNulo{
		List<Livro> livrosPorAutor = new ArrayList<>();
		
		//verifica se a lista não está vazia
		if(!catalogoLivros.isEmpty()) {
			for(Livro l : catalogoLivros) {
				if(l.getAutor().equalsIgnoreCase(autor)) {
					livrosPorAutor.add(l);
				}
			}if(!livrosPorAutor.isEmpty())
				return livrosPorAutor;
			else
				throw new ExceptionNulo();
		}else
			throw new ExceptionNulo();
		
	}
	
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) throws ExceptionNulo{
		List<Livro> livrosIntervaloAnos = new ArrayList<>();
		if(!catalogoLivros.isEmpty()) {
			for(Livro l : catalogoLivros) {
				if(l.getAnoPublicacao() >= anoInicial & l.getAnoPublicacao() <= anoFinal) {
					livrosIntervaloAnos.add(l);
				}
			}if(!livrosIntervaloAnos.isEmpty())
				return livrosIntervaloAnos;
			else
				throw new ExceptionNulo();
		}else
			throw new ExceptionNulo();
	}
	
	public List<Livro> pesquisarPorTitulo(String titulo) throws ExceptionNulo {
		List<Livro> livrosPorTitulo = new ArrayList<>();
		if(!catalogoLivros.isEmpty()) {
			for(Livro l : catalogoLivros) {
				if(l.getTitulo().startsWith(titulo) || l.getTitulo().equalsIgnoreCase(titulo)){
					livrosPorTitulo.add(l);
				}
			}if(!livrosPorTitulo.isEmpty())
				return livrosPorTitulo;
			else
				throw new ExceptionNulo();
		}else
			throw new ExceptionNulo();
	}
}
