package com.example.recetas.data;

import java.util.ArrayList;

public class PlatosFuertes {


    private static ArrayList<PlatosFuertesList> listHotel;

    public static ArrayList<PlatosFuertesList> getHotels(){
        if(listHotel == null) listHotel = new ArrayList<>();
        listHotel.add(new PlatosFuertesList("4 estrellas", "Hotel Realeza",
                "Con 5 piscinas al aire libre, el Riu Dunamar All Inclusive está situado frente a Playa Costa Mujeres, en Cancún. La propiedad cuenta con el Splash Water World, un parque acuático con toboganes, además de régimen all inclusive 24h.",
                "https://media-cdn.tripadvisor.com/media/photo-s/25/fb/8c/46/hotel-exterior.jpg"));
        listHotel.add(new PlatosFuertesList("5 estrellas", "Hotel Casa Maya",
                "El Hotel Casa Maya está situado a 8 minutos en coche del centro de Cancún y ofrece vistas espléndidas a la laguna Nichupté y al mar Caribe. Cuenta con 2 restaurantes, bañera de hidromasaje y piscina al aire libre.",
                "https://media.staticontent.com/media/pictures/519cbbe5-2322-4d44-b5be-d1785272f974/300x200"));
        listHotel.add(new PlatosFuertesList("5 estrellas", "Queen Hotel.",
                "Cuenta con piscina al aire libre y está en Cancún, al lado de la laguna, a 400 metros de la playa Tortugas y a 3 km del centro comercial Plaza Caracol. Ofrece WiFi gratis.",
                "https://media-cdn.tripadvisor.com/media/photo-s/16/1a/ea/54/hotel-presidente-4s.jpg"));

        listHotel.add(new PlatosFuertesList("3 estrellas", "Oz Resort.",
                "Cuenta con piscina al aire libre y lavadora. Se encuentra frente a la playa y ofrece terraza, aparcamiento privado gratuito y WiFi gratuita.",
                "https://consejosdecancun.com/wp-content/uploads/2018/02/hotel-em-cancun.jpg"));

        listHotel.add(new PlatosFuertesList("4 estrellas", "Candel Resort.",
                "Cuenta con piscina al aire libre con vistas al mar, solárium, bañera de hidromasaje, mostrador de información turística y club infantil. Los huéspedes también pueden practicar snorkel, buceo y golf durante su estancia.",
                "https://imgcy.trivago.com/c_lfill,f_auto,g_faces,q_auto:good,w_756/mag/2021/08/25212949/lugares-turisticos-de-baja-california-sur-mexico-exterior.jpeg"));

        return listHotel;
    }


    public static ArrayList<PlatosFuertesList> getPlatosFuertes(){
        if(listHotel == null) listHotel = new ArrayList<>();
        listHotel.add(new PlatosFuertesList("4 estrellas", "Hotel Realeza",
                "Con 5 piscinas al aire libre, el Riu Dunamar All Inclusive está situado frente a Playa Costa Mujeres, en Cancún. La propiedad cuenta con el Splash Water World, un parque acuático con toboganes, además de régimen all inclusive 24h.",
                "https://media-cdn.tripadvisor.com/media/photo-s/25/fb/8c/46/hotel-exterior.jpg"));
        listHotel.add(new PlatosFuertesList("5 estrellas", "Hotel Casa Maya",
                "El Hotel Casa Maya está situado a 8 minutos en coche del centro de Cancún y ofrece vistas espléndidas a la laguna Nichupté y al mar Caribe. Cuenta con 2 restaurantes, bañera de hidromasaje y piscina al aire libre.",
                "https://media.staticontent.com/media/pictures/519cbbe5-2322-4d44-b5be-d1785272f974/300x200"));
        listHotel.add(new PlatosFuertesList("5 estrellas", "Queen Hotel.",
                "Cuenta con piscina al aire libre y está en Cancún, al lado de la laguna, a 400 metros de la playa Tortugas y a 3 km del centro comercial Plaza Caracol. Ofrece WiFi gratis.",
                "https://media-cdn.tripadvisor.com/media/photo-s/16/1a/ea/54/hotel-presidente-4s.jpg"));

        listHotel.add(new PlatosFuertesList("3 estrellas", "Oz Resort.",
                "Cuenta con piscina al aire libre y lavadora. Se encuentra frente a la playa y ofrece terraza, aparcamiento privado gratuito y WiFi gratuita.",
                "https://consejosdecancun.com/wp-content/uploads/2018/02/hotel-em-cancun.jpg"));

        listHotel.add(new PlatosFuertesList("4 estrellas", "Candel Resort.",
                "Cuenta con piscina al aire libre con vistas al mar, solárium, bañera de hidromasaje, mostrador de información turística y club infantil. Los huéspedes también pueden practicar snorkel, buceo y golf durante su estancia.",
                "https://imgcy.trivago.com/c_lfill,f_auto,g_faces,q_auto:good,w_756/mag/2021/08/25212949/lugares-turisticos-de-baja-california-sur-mexico-exterior.jpeg"));

        return listHotel;
    }


}
