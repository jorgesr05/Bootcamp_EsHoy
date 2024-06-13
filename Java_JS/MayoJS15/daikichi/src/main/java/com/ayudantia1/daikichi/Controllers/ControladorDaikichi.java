package com.ayudantia1.daikichi.Controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;




@RestController
@RequestMapping("daikichi")
public class ControladorDaikichi {

    /* Ruta estatica */
    @GetMapping("")
    public String bienvenido() {
        return "Bienvenido";
    }
    
    @GetMapping("/today")
    public String today() {
        return "Today you will find look in all your endeavors!";
    }

    @GetMapping("/tomorrow")
    public String tomorrow() {
        return "Tomorrow, an opportunity will arrive, so be sure to be open to new ideas!";
    }
    
    /* Variables de ruta */

    /* ruta/travel/{ciudad} */

    @GetMapping("/travel/{ciudad}")
    public String travelCiudad(@PathVariable("ciudad") String ciudad){
        return "Felicitaciones pronto viajarás a " + ciudad;
    }

    /* ruta http://localhost:8080/daikichi/lotto/8 */

    @GetMapping("/lotto/{num}")
    public String lotto(@PathVariable("num") Integer num) {
        
        if(num%2 == 0){
            return "Harás un gran viaje en un futuro cercano, pero ten cuidado con las ofertas tentadoras";
        }
         
        return "Has disfrutado de los frutos de tu trabajo, pero ahora es un buen momento para pasar tiempo con familiares y amigos";
    }
    

    
    
}
