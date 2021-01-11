package ru.java;

class Point {
    // поля класса
    public double x;
    public double y;

    // конструктор
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public static double distance (Point p1, Point p2) {
        double d = Math.sqrt((p2.y - p1.y) * (p2.y - p1.y) + (p2.x - p1.x) * (p2.x - p1.x));
        return d;
    }
        public static void main(String[] args) {
            Point p1 = new Point(1.4, 1.7);
            Point p2 = new Point(2.8, 2.5);
            double d = Math.sqrt((p2.y - p1.y) * (p2.y - p1.y) + (p2.x - p1.x) * (p2.x - p1.x));
            System.out.println("Расстояние между двумя точками составляет " + d);
        }

}


