import java.util.Scanner;

public class Cliente 
{
    public static void main(String[] args)
    {
        Carro carrodemisSuenos;
        Scanner leer = new Scanner (System.in);
        System.out.println("El cliente va a comprar un carro, ingrese 1 para Ferrari, 2 para Hyundai");
        int opcion = leer.nextInt();
        if(opcion==1)
        {
            carrodemisSuenos = FabricaCarros.getCarro("Ferrari"); 
        }
        else
        {
            carrodemisSuenos = FabricaCarros.getCarro("Hyundai");
        }

        try
        {
            carrodemisSuenos.acelerar();
        }
        catch(Exception ex)
        {
            
        }
        finally
        {
            leer.close();
        }
    }   
}
