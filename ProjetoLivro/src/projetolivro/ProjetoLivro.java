
package projetolivro;


public class ProjetoLivro {

    
    public static void main(String[] args) {
       
        Pessoa [] p = new Pessoa[2];
        Livro [] l = new Livro[3];
        
        p[0] = new Pessoa("Jonathan", 28, "M");
        p[1] = new Pessoa("Kelly", 24, "F");
        
        l[0] = new Livro(" java ", "Stev jobs", 200, p[0]);
        l[1] = new Livro(" python ", "Stev jobs", 350, p[1]);
        l[2] = new Livro(" php ", "Stev jobs", 420, p[0]);
        
        
        l[0].abrir();
        l[0].folhear(150);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
        
        
        l[1].abrir();
        l[1].folhear(100);
        l[1].voltarPag();
        System.out.println(l[1].detalhes());
        
        l[2].abrir();
        l[2].folhear(200);
        l[2].fechar();
        System.out.println(l[2].detalhes());
        
        
        
    }
    
}
