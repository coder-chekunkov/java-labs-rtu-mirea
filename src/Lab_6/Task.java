package Lab_6;

public class Task {

    String name;
    int hoursToComplete;
    String info;
    int fee;
    int numberEmployer;
    String status;

    public Task(String name, int hoursToComplete, String info, int fee, int numberEmployer, String status){
        this.name = name;
        this.hoursToComplete = hoursToComplete;
        this.info = info;
        this.fee = fee;
        this.numberEmployer = numberEmployer;
        this.status = status;
    }

    public String toString(){
        return "Название задачи: " + name + "; Часов на выполнение: " + hoursToComplete + "; Информация: " +
                info + "; Гонорар: " + fee + "; Номер работника: " + numberEmployer + "; Статус: " + status + ";";
    }

    public int getFee(){
        return fee;
    }


}
