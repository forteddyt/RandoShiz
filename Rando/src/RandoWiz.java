import java.util.Map;
import java.util.TreeMap;

public class RandoWiz
{

    public static void main(String[] args)
    {
        RandoWiz r = new RandoWiz();

        r.unknown(4);

        r.enumsInMaps();
    }


    void unknown(int n)
    {
        if (n > 0)
            unknown(n - 1);
        System.out.print("?");
    }


    public void enumsInMaps()
    {
        Map<GenericEnum, String> map = new TreeMap<GenericEnum, String>();
        System.out.println(map.get(GenericEnum.type1));
        map.put(GenericEnum.type2, "Type 2");
        System.out.println(map.get(GenericEnum.type2));
    }

}
