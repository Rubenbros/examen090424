public class Main {

    // Si estás viendo esto es que has encontrado la solución secreta. Enhorabuena.
    // Lo primero que tienes que hacer es guardar silencio y no decir absolutamente nada sobre esto hasta que termine
    // el examen. Al acceder aquí has demostrado un uso avanzado de git y, por tanto, te mereces la solución
    // (O has tenido mucha suerte, en cualquier caso te lo mereces)

    public static void main(String[] args) {
        boolean[] resets = {true, true, true };
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
        final int MIN_PASSWORD_LENGTH = 8;
        if (password.length() < MIN_PASSWORD_LENGTH)
            throw new IllegalArgumentException("El password debe tener al menos 8 caracteres");
        else if (!contieneMayuscula(password))
            throw new IllegalArgumentException("El password debe tener al menos una mayúscula");
        else if (!contieneMinuscula(password))
            throw new IllegalArgumentException("El password debe tener al menos una minúscula");

        return true;
    }

    private static boolean contieneMinuscula(String password) {
        return password.matches(".*[a-z].*");
    }

    private static boolean contieneMayuscula(String password) {
        return password.matches(".*[A-Z].*");
    }

    //EJERCICIO 2 (2 PUNTOS)
    //Refactoriza el código para que sea lo más limpio posible.

    //EJERCICIO 3 (3 PUNTOS)
    //Crea una clase de test que pruebe el método passwordValidator y los casos de prueba que consideres necesarios.

    //EJERCICIO 4 (2 PUNTOS)
    //Encuentra y arregla el error en este código sabiendo que esEmpirico devuelve true si todos los valores del array
    //son iguales a true
    public static boolean esEmpirico(boolean[] resets) {
        boolean talCual = true;
        for(int i = 1; i <= resets.length; i++) {
            if(i == resets.length){
                talCual = resets[i-1] && talCual;
            }
            else{
                talCual = resets[i] && talCual;
            }
        }
        return talCual;
    }
}