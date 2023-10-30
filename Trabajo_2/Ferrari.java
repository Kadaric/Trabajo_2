public class Ferrari extends Carro 
{
    Ferrari(Radio radio)
    {
        super(radio);
        System.out.println("El carro Ferrari se configuro correctamente ");
    }  
    
    public void acelerar()
    {
        System.out.println("Se aceleró el carro Ferrari correctamente ");
    }    
}
