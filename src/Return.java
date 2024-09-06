public class Return {
    public String echo(String s)
    {
        return s;
    }
    public String hola(String s)
    {
        return "Hola " + s + "!";
    }
    public String testGreaterThan(int val) {
        if (val>100) {  // Cambia esta línea
            return "Por encima de 100";
        }

        if (val>10) {  // Cambia esta línea
            return "Por encima de 10";
        }

        return "10 o menos";
    }
    public String testGreaterOrEqual(int val) {
        if (val>=20) {  // Cambia esta línea
            return "20 or más";
        }

        if (val>=10) {  // Cambia esta línea
            return "10 o más";
        }

        return "menos de 10";
    }
    public String testLessThan(int val) {
        if (val<25) {  // Cambia esta línea
            return "Por debajo de 25";
        }

        if (val<55) {  // Cambia esta línea
            return "Por debajo de 55";
        }

        return "55 o más";
    }
    public String testLessOrEqual(int val) {
        if (val<=12) {  // Cambia esta línea
            return "Menor o igual a 12";
        }

        if (val<24) {  // Cambia esta línea
            return "Menor o igual a 24";
        }

        return "More Than 24";
    }
    public String testLogicalOr(int val) {
        if (val>=10 && val<=20) { // Cambia esta línea
            return "Inside";
        }else {
            return "Outside";
        }
    }
    public String testEqual(int val) {
        if (val==12) { // Cambia esta línea
            return "Equal";
        }
        return "Not Equal";
    }
    public String testElse(int val) {
        String result = "";

        if (val > 5) {
            result = "Mayor que 5";
        }
        else  {
            result = "5 o más pequeño";
        }

        return result;
    }
    public String testElseIf(int val) {
        String result = "";

        if (val > 5) {
            result = "Bigger than 5";
        }
        else if (val < 5) {
            result = "Smaller than 5";
        }
        else {
            result = "Equal to 5";
        }

        return result;
    }
    public String orderMyLogic(int val) {
        if (val < 5) {
            return "Menos que 5";
        } else if (val < 10) {
            return "Menos que 10";
        } else {
            return "Mayor o igual a 10";
        }
    }
    public String testSize(int num) {
        if(num < 5)
        {
            return "Tiny";
        } else if (num < 10) {
            return "Small";
        } else if (num < 15) {
            return "Medium";
        } else if (num < 20) {
            return "Large";
        }else {
            return "Huge";
        }
    }
    public Boolean nand(boolean a, boolean b){
        return a && b;
    }
    public Boolean nor(boolean a, boolean b){
        return !a && !b;
    }
    public Boolean xor(boolean a, boolean b){
        return a != b;
    }


    public static void main(String[] args) {
        Return r = new Return();

        // ex 1 "Hi!"
        // ex 2 "How do you do?"
        // ex 3 "Donde esta Jacky?
        // ex 4
//        System.out.println(r.echo("Greta"));
//        System.out.println(r.echo("CO2"));
        // ex 5
//        System.out.println(r.hola("Ada"));
//        System.out.println(r.hola("Grace"));
        // ex 6
//        System.out.println(r.testGreaterThan(9));
        // ex 7
//        System.out.println(r.testGreaterOrEqual(10));
        // ex 8
//        System.out.println(r.testLessThan(54));
        // ex 9
//        System.out.println(r.testLessOrEqual(12));
        // ex 10
//        System.out.println(r.testLogicalOr(12));
        // ex 11
//        System.out.println(r.testEqual(12));
        // ex 12
//        System.out.println(r.testElse(5));
        // ex 13
//        System.out.println(r.testElseIf(5));
        // ex 14 Hi Selva! Hi Pola!
        // ex 15 Roy and Roy
        // ex 16
//        System.out.println(r.orderMyLogic(7));
        // ex 17
//        System.out.println(r.testSize(20));
        // ex 18
//        System.out.println(r.nand(false, true));
        // ex 19
//        System.out.println(r.nor(false, false));
        // ex 20
//        System.out.println(r.xor(true, true));

        // Bloque 2
        // ex 1

    }
}
