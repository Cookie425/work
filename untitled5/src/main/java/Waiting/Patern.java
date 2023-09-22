package Waiting;

public class Patern {
   private int id;
   private static Patern fd;
   public static Patern getInstant(int id){
       if (fd == null) {
           fd = new Patern(id);

       }
       return (fd);

   }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    private Patern(int id) {
        this.id = id;
    }

}

