public class SUV extends Automobile 
{
	private int numpass;
    private double cargospc;

    public SUV(String mk, String md, int y, int nw, int np, Double cspc) {
        super(mk, md, y, nw);
        numpass = np;
        cargospc = cspc;
    }

    @Override
    public void getinfo(){
        super.getinfo();
        System.out.println("Passengers: " + numpass);
        System.out.println("Cargo Space: " + cargospc);
    }
}
