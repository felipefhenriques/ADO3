/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LojaCarroController;

import LojaCarroDAO.CarroDAO;
import LojaCarroModel.Carro;

import java.util.ArrayList;

/**
 *
 * @author Felipe
 */
public class CarroController {
    
    public static boolean salvar( String pModelo, int pAno, double pValor)
    {
        //Salvo na memória
        Carro p =  new Carro(pModelo,pAno, pValor);
        return CarroDAO.salvar(p);
    }
    
    public static boolean excluir(int pID)
    {
        return CarroDAO.excluir(pID);
    }
    
    public static boolean atualizar(int pID, int pAno, double pValor, String pModelo)
    {
        Carro p =  new Carro(pID, pAno,pValor, pModelo);
        return CarroDAO.atualizar(p);
        
    }
    
   
    public static ArrayList<String[]> consultar()
    {
        ArrayList<Carro> carros = CarroDAO.consultar();
        ArrayList<String[]> listaCarros = new ArrayList<>();
        
        for(int i=0;i<carros.size();i++)
        {
            listaCarros.add(new String[]{String.valueOf(carros.get(i).getIdcarro()),String.valueOf(carros.get(i).getAno()), String.valueOf(carros.get(i).getValor()), String.valueOf(carros.get(i).getModelo())});
        
        }
        
        return listaCarros;
        
    }
    
}
