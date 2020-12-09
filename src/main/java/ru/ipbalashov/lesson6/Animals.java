package ru.ipbalashov.lesson6;

public class Animals {
    protected String name;
    protected String type;
    protected int maxRun;
    protected int maxSwim;

    public Animals(String name) {
        this.name = name;
    }

    public void run(int dist) {
        if (this.maxRun > dist) {
            System.out.println(this.type + " " + this.name + " бежит " + dist + "м");
        } else {
            System.out.println(this.type + " " + this.name + " не может столько пробежать");
        }
    }

    public void swim(int dist) {
        if (this.maxSwim > dist) {
            System.out.println(this.type + " " + this.name + " плывет " + dist + "м");
        } else {
            System.out.println(this.type + " " + this.name + " не может столько проплыть");
        }
    }


    public void info() {
        System.out.println(this.type + " " + this.name + " бежит " + this.maxRun + "м" + " плавает " + this.maxSwim + " м");
    }
}

