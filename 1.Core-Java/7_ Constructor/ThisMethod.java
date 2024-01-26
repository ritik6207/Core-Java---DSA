class CollageFacility
{
    private String mainCollage;
    private String exeCollage;
    private String advCollage;
    private String sceCollage;
    public CollageFacility()
    {
        this("With NBA");
        System.out.println("This is Default Constructor");
        mainCollage = "With NBA and T&P";
        exeCollage = "not allow NBA";
        advCollage = "Student pay";
        sceCollage = "with scholarship ";
        System.out.println();
    }
    public CollageFacility(String mainCollage)
    {
        this("With NBA", "not allow NBA");
        System.out.println("This is MainCollage Parametrized constructor");
        this.mainCollage = mainCollage;
        exeCollage = "not allow NBA";
        advCollage = "Student pay full fee";
        sceCollage = "with scholarship";
        System.out.println();
    }
    public CollageFacility(String mainCollage, String exeCollage)
    {
        this("With NBA", "not allow NBA", "Student pay full fee");
        System.out.println("This is MainCollage asd exeCollage Parametrized constructor");
        this.mainCollage = mainCollage;
        this.exeCollage = exeCollage;
        advCollage = "Student pay full fee";
        sceCollage = "with scholarship";
        System.out.println();
    }
    public CollageFacility(String mainCollage, String exeCollage, String advCollage)
    {
        this("With NBA", "not allow NBA", "Student pay full fee","with scholarship");
        System.out.println("This is MainCollage, exeCollage and advCollage Parametrized constructor");
        this.mainCollage = mainCollage;
        this.exeCollage = exeCollage;
        this.advCollage = advCollage;
        sceCollage = "with scholarship";
        System.out.println();
    }
    public CollageFacility(String mainCollage, String exeCollage, String advCollage, String sceCollage)
    {
        System.out.println("This is MainCollage, exeCollage, advCollage and sceCollage Parametrized constructor");
        this.mainCollage = mainCollage;
        this.exeCollage = exeCollage;
        this.advCollage = advCollage;
        this.sceCollage = sceCollage;
        System.out.println();
    }
    void disp()
    {
        System.out.println(mainCollage);
        System.out.println(exeCollage);
        System.out.println(advCollage);
        System.out.println(sceCollage);
    }
}
public class ThisMethod {
    public static void main(String[] args) {
        CollageFacility c1 = new CollageFacility();
        c1.disp();
        CollageFacility c2 = new CollageFacility("With NBA");
        c2.disp();
        CollageFacility c3 = new CollageFacility("With NBA",
                "not allow NBA");
        c3.disp();
        CollageFacility c4 = new CollageFacility("With NBA",
                "not allow NBA",
                "Student pay full fee");
        c4.disp();
        CollageFacility c5 = new CollageFacility("With NBA",
                "not allow NBA",
                "Student pay full fee",
                "with scholarship");
        c5.disp();
    }
}
