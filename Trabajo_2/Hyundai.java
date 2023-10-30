public class Hyundai extends Carro 
{
    Hyundai(Radio radio)
    {
        super(radio);
        System.out.println("El carro Hyundai se configuro correctamente ");
    }  
    
    public void acelerar()
    {
        System.out.println("El carro Hyundai se aceleró correctamente");
    }
}