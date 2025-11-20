/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package panelfondo;


   
// Imports necesarios para dibujar y manejar imágenes
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 * COMPONENTE PERSONALIZADO (El "molde")
 *
 * Es un JPanel que hemos modificado (heredado) para que sepa
 * cómo dibujar una imagen de fondo.
 */
public class PanelFondo extends JPanel { // Extiende de JPanel

    // Variable para guardar la imagen que dibujaremos
    private Image imagenFondo;

    /**
     * Este método es llamado por Swing automáticamente.
     * Lo anulamos (override) para decirle: "Además de lo normal,
     * dibuja nuestra imagen".
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Llama al método original (importante)

        // Si hay una imagen cargada, la dibuja
        if (imagenFondo != null) {
            // Dibuja la imagen en las coordenadas (0,0) y
            // la estira al tamaño actual del panel (getWidth, getHeight)
            g.drawImage(imagenFondo, 0, 0, getWidth(), getHeight(), this);
        }
    }

    /**
     * (Tu metodología) Método "setter" personalizado que usaremos
     * desde nuestro formulario para decirle a este panel qué imagen cargar.
     *
     * @param nombreImagen El nombre del archivo (ej: "gato.png")
     */
    public void setImagenFondo(String nombreImagen) {
        // 1. Construir el path del RECURSO
        // (Asumiendo que las imágenes están en el paquete 'Memes')
        String pathRecurso = "/Memes/" + nombreImagen;

        // 2. Obtener la URL del recurso
        URL imgUrl = getClass().getResource(pathRecurso);

        // 3. Validar si se encontró
        if (imgUrl != null) {
            // Si se encontró, la carga
            this.imagenFondo = new ImageIcon(imgUrl).getImage();
        } else {
            // Si no, imprime un error y no pone fondo
            System.err.println("Error: No se encontró el recurso de fondo: " + pathRecurso);
            this.imagenFondo = null;
        }

        // 4. ¡Importante! Llama a repaint() para que el panel
        // se vuelva a dibujar AHORA MISMO con la nueva imagen.
        repaint();
    }
}


