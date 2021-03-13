/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esocial.v1_0;

/**
 *
 * @author Ivo
 */
public class Teste {
  
  public Nivel1 n1;
  public String n1s;
  
  public Nivel1<Teste> n1(){
    return new Nivel1<>(this);
  }
  
  public Teste n1s(String n1s){
    this.n1s = n1s;
    return this;
  }
  
  
  public static class Nivel1<T> {
    
    public Object pai;

    public Nivel1(Object pai) {
      this.pai = pai;
    }
    
    public T finish(){
      return (T) pai;
    }
    
    public Nivel2 n2;
    
    public Nivel2<Nivel1<T>> n2(){
      return new Nivel2<>(this);
    }
    
    public static class Nivel2<T> {
    
      public Object pai;

      public Nivel2(Object pai) {
        this.pai = pai;
      }

      public T finish(){
        return (T) pai;
      }
    
      public Nivel3 n3;
    
      public Nivel3<Nivel2<T>> n3(){
        return new Nivel3<>(this);
      }
    
      public static class Nivel3<T> {
    
        public Object pai;

        public Nivel3(Object pai) {
          this.pai = pai;
        }

        public T finish(){
          return (T) pai;
        }

        public Nivel4 n4;
        
        public Nivel4<Nivel3<T>> n4(){
          return new Nivel4<>(this);
        }

        public static class Nivel4<T> {
    
          public Object pai;
          
          public String n5;
          
          public Nivel4<T> n5(String n5){
            this.n5 = n5;
            return this;
          }

          public Nivel4(Object pai) {
            this.pai = pai;
          }

          public T finish(){
            return (T) pai;
          }

        }

      }
    
    }
  }
}
