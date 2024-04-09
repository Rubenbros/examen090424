public class Main {

    public static void main(String[] args) {
        boolean[] resets = {false, false, false };
        if(esEmpirico(resets)){
            System.out.println("tal cual hermano");
        }
        else{
            System.out.println("huh");
        }
    }

    //EJERCICIO 1 (3 PUNTOS)
    //Crea una función que recibe un password y compruebe que cumple los siguientes requisitos:
    // - Tener al menos 8 caracteres
    // - Tener al menos una mayúscula
    // - Tener al menos una minúscula
    // Si cumple todos los requisitos debería devolver true, en caso contrario debería devolver un error con la causa
    public static boolean passwordValidator(String password) {
        return true;
    }

    //EJERCICIO 2 (2 PUNTOS)
    //Refactoriza el código para que sea lo más limpio posible.

    //EJERCICIO 3 (3 PUNTOS)
    //Crea una clase de test que pruebe el método passwordValidator y los casos de prueba que consideres necesarios.

    //EJERCICIO 4 (2 PUNTOS)
    //Encuentra y arregla el error en este código sabiendo que esEmpirico devuelve true si todos los valores del array
    //son iguales a true. Solo puedes modificar una linea.
    public static boolean esEmpirico(boolean[] resets) {
        boolean talCual = true;
        for(int i = 0; i <= resets.length; i++) {
            if(i == resets.length){
                talCual = compruebaResetUltimo(resets, i, talCual);
                resets[i-1]=false;
            }
            else{
                talCual = compruebaReset(talCual, resets[i]);
                resets[i]=false;
            }
        }
        return talCual;
    }

    private static boolean compruebaReset(boolean talCual, boolean resets) {
        return resets && talCual;
    }

    private static boolean compruebaResetUltimo(boolean[] resets, int i, boolean talCual) {
        return resets[i - 1] && talCual;
    }
}