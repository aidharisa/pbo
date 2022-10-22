abstract class SakitKepala{
    protected abstract void pusing();
}

class pasien1 extends SakitKepala{
    protected void pusing(){
        System.out.println("gapunya duit");
    }
}

class pasien2 extends SakitKepala{
    protected void pusing(){
        System.out.println("migrain");
    }
}

class pasien3 extends SakitKepala{
    protected void pusing(){
        System.out.println("Darah rendah");
    }
}

public class overloading{
    public static void main(String[] args) {
      SakitKepala pasien1 = new pasien1();
      pasien1.pusing();
      
      SakitKepala pasien2 = new pasien2();
      pasien2.pusing();

      SakitKepala pasien3 = new pasien3();
      pasien3.pusing();
    }
}