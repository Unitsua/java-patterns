package component;

public class Client {
    public static void main (String[] args) {
        AbstractBrand aaOffice,exOffice;
        Brand brand,brand1,brand2,brand3;

        brand = new Brand ( "北京总部" );
        aaOffice = new AaOffice ( "教务办公室" );
        exOffice = new ExOffice ("行政办公室" );
        brand1 = new Brand ("湖南分校" );
        brand2 = new Brand ( "长沙教学点" );
        brand3 = new Brand ( "湘潭教学点" );

        brand.add ( aaOffice );
        brand.add ( exOffice );
        brand.add ( brand1 );

        brand.issueDoc ( aaOffice );
        brand.issueDoc ( exOffice );
        brand.issueDoc ( brand1 );
        System.out.println();
        System.out.println ("**********************************");

        brand1.add ( aaOffice );
        brand1.add ( exOffice );
        brand1.add ( brand2 );
        brand1.add ( brand3 );

        brand1.issueDoc ( aaOffice );
        brand1.issueDoc ( exOffice );
        brand1.issueDoc ( brand2 );
        brand1.issueDoc ( brand3 );

        System.out.println();
        System.out.println ("**********************************");
        brand2.add ( aaOffice );
        brand2.add ( exOffice );
        brand2.issueDoc ( aaOffice );
        brand2.issueDoc ( exOffice );

        System.out.println();
        System.out.println ("**********************************");
        brand3.add ( aaOffice );
        brand3.add ( exOffice );
        brand3.issueDoc ( aaOffice );
        brand3.issueDoc ( exOffice );

        System.out.println();
        System.out.println ("*************组织结构图**********");
        brand.printStruct ( "" );

    }
}
