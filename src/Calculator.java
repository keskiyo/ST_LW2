import java.util.Scanner;

public class Calculator {
    private Scanner scanner;

    double T, W, t, N, r, V, S;

    public Calculator() {
        this.scanner = new Scanner(System.in, "UTF-8");
    }
    
    public double frequencyOfTreatment(double T) {
        return 1 / T;
    }

    public double periodOfTreatmentCorner(double W) {
        return (2 * Math.PI) / W;
    }

    public double periodOfTreatmentTime(double t, double N) {
        return t / N;
    }

    public double linearSkewness(double S, double t) {
        return S / t;
    }

    public double linearSkewnessPeriod(double r, double T) {
        return (2 * Math.PI * r) / T;
    }

    public double angularVelocity(double angleOfRotation, double t) {
        return angleOfRotation / t;
    }

    public double angularVelocityPeriod(double T) {
        return (2 * Math.PI) / T;
    }

    public double angularVelocityToLinearVelocity(double W, double r) {
        return W * r;
    }

    public double centripetalAcceleration(double V, double r) {
        return (V * V) / r;
    }

    public double centripetalAccelerationCorner(double W, double r) {
        return (W * W) * r;
    }
    public void choice() {
        System.out.println("Выберите элемент, который хотите рассчитать");
        System.out.println(" 1 - Частота обращения \n 2 - Период обращения через угловую скорость\n 3 - Период обращения через время\n 4 - Линейная скорость \n 5 - Линейная скорость, через период обращения\n 6 - Угловая скорость \n 7 - Угловая скорость, через период \n 8 - Перевод из угловой скорости в линейную\n 9 - Центростремительное ускорение\n 10 - Центростермительное ускорение, через линейную скорость\n");
    }

    public double calculate(int input) {
        switch (input) {
            case 1:
                T = getDoubleInput("Введите период: ");
                return frequencyOfTreatment(T);
            case 2:
                W = getDoubleInput("Введите угловую скорость: ");
                return periodOfTreatmentCorner(W);
            case 3:
                t = getDoubleInput("Введите время: ");
                N = getDoubleInput("Введите количество вращений: ");
                return periodOfTreatmentTime(t, N);
            case 4:
                S = getDoubleInput("Введите расстояние: ");
                t = getDoubleInput("Введите время: ");
                return linearSkewness(S, t);
            case 5: 
                r = getDoubleInput("Введите радиус: ");
                T = getDoubleInput("Введите период: ");
                return linearSkewnessPeriod(r, T);
            case 6:
                double angleOfRotation = getDoubleInput("Введите угол поворота: ");
                t = getDoubleInput("Введите время: ");
                return angularVelocity(angleOfRotation, t);
            case 7:
                T = getDoubleInput("Введите период: ");
                return angularVelocityPeriod(T);
            case 8:
                W = getDoubleInput("Введите угловую скорость: ");
                r = getDoubleInput("Введите радиус: ");
                return angularVelocityToLinearVelocity(W, r);
            case 9:
                double V = getDoubleInput("Линейная скорость: ");
                r = getDoubleInput("Введите радиус: ");
                return centripetalAcceleration(V, r);
            case 10:
                W = getDoubleInput("Введите угловую скорость: ");
                r = getDoubleInput("Введите радиус: ");
                return centripetalAccelerationCorner(W, r);
            default:
                System.out.println("Некорректный номер операции");
                return -1;
        }
    }
    double getDoubleInput(String message) {
        System.out.print(message);
        return scanner.nextDouble();
    }
}