public class FabricaCarros
{
    public static Carro getCarro(String marca)
    {
        if(marca.equals("Ferrari"))
        {
            return FabricaFerrari.fabricarCarro(FabricaFerrari.fabricarRadio("Panasonic"));          

        }
        else if(marca.equals("Hyundai"))
        {
            return FabricaHyundai.fabricarCarro(FabricaFerrari.fabricarRadio("Sony"));          
        }
        
        return null;
    }
}