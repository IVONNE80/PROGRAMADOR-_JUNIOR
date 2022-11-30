
public class Ordenamiento {
    public static void burbuja(int []arreglo) {
        for(int i = 0;i<arreglo.length-1;i++){
            for (int j = 0; j < arreglo.length-i-1; j++) {
                if (arreglo [j] > arreglo [j+1]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo [j+1];
                    arreglo [j+1] = aux;
                    
                } 
                    
                
            }

        }
        
    }
    
    public static void insercion(int []arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            
        }
        
    }
    public static void quickSart(int []arreglo) {
        for(int i = 0;i <arreglo.length;i++){

        }
    }
}
