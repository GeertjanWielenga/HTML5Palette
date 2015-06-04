@PaletteItemRegistrations({
        @PaletteItemRegistration(
                paletteid = "HTMLPalette",
                category = "HTML5",
                itemid = "Audio",
                icon16 = "com/mycompany/html5palette/icons/audio.png",
                icon32 = "com/mycompany/html5palette/icons/audio32.png",
                body = "<audio src=\"somefile.mp3\" controls loop autoplay></audio>",
                name = "Audio",
                tooltip = "<audio>"),
        @PaletteItemRegistration(
                paletteid = "HTMLPalette",
                category = "HTML5",
                itemid = "Video",
                icon16 = "com/mycompany/html5palette/icons/video.png",
                icon32 = "com/mycompany/html5palette/icons/video32.png",
                body = "<video src=\"somefile.mp4\" controls width=\"340\" height=\"210\"></video>",
                name = "Video",
                tooltip = "<video>")
})
package com.mycompany.html5palette;

import org.netbeans.spi.palette.PaletteItemRegistration;
import org.netbeans.spi.palette.PaletteItemRegistrations;
