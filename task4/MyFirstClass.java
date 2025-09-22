 class MyFirstClass {
    public static void main(String[] args) {
        MysecondClass qwerty = new MysecondClass(0, 0);
        int i, j;

        System.out.println("Множитель таблицы:");

        for (i = 1; i <= 8; i++) {
            for (j = 1; j <= 8; j++) {
                qwerty.SetNumber_a(i);
                qwerty.SetNumber_b(j);
                System.out.print(qwerty.process() + "\t");
            }
            System.out.println();
        }
    }
}

class MysecondClass {
    private int a, b;

    public MysecondClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void SetNumber_a(int a) {
        this.a = a;
    }

    public void SetNumber_b(int b) {
        this.b = b;
    }

    public int process() {
        return a * b;
    }
}