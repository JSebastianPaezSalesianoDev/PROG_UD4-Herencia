package Net.SalesianosSchool.Actividad.primera;

public class SalesianosSchool {
    
    private int id;
    private String name;
    public static String GROUP = "Salesianos";
    public static int totalSchool = 0;

    public SalesianosSchool(int id, String name){

        this.id = id;
        this.name = name;
        SalesianosSchool.totalSchool++;
        
    }
}
