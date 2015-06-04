@PaletteItemRegistrations({
    @PaletteItemRegistration(
            paletteid = "HTMLPalette",
            category = "HTML5",
            itemid = "Audio",
            icon16 = "com/mycompany/html5palette/icons/audio.png",
            icon32 = "com/mycompany/html5palette/icons/audio32.png",
            body = "<audio src=\"somefile.mp3\" controls loop autoplay></audio>",
            tooltip = "<audio src= controls loop autoplay></audio>",
            name = "Audio"),
    @PaletteItemRegistration(
            paletteid = "HTMLPalette",
            category = "HTML5",
            itemid = "Video",
            icon16 = "com/mycompany/html5palette/icons/video.png",
            icon32 = "com/mycompany/html5palette/icons/video32.png",
            body = "<video src=\"somefile.mp4\" controls width=\"340\" height=\"210\"></video>",
            tooltip = "<video src= controls width= height=></video>",
            name = "Video"),
    @PaletteItemRegistration(
            paletteid = "HTMLPalette",
            category = "HTML5",
            itemid = "Data List",
            icon16 = "com/mycompany/html5palette/icons/datalist.png",
            icon32 = "com/mycompany/html5palette/icons/datalist32.png",
            body = "<label for=\"country_name\">Country: "
            + "</label>\n<input id=\"country_name\" name=\"country_name\" "
            + "type=\"text\" list=\"country\" />\n"
            + "<datalist id=\"country\">\n"
            + "   <option value=\"Afghanistan\">\n"
            + "   <option value=\"Albania\">\n"
            + "   <option value=\"Algeria\">\n"
            + "   <option value=\"Andorra\">\n"
            + "   <option value=\"Angola\">\n"
            + "</datalist>",
            tooltip = "<datalist id=\"\"><option value=\"\"></datalist>",
            name = "Data List")
})
package com.mycompany.html5palette;

import org.netbeans.spi.palette.PaletteItemRegistration;
import org.netbeans.spi.palette.PaletteItemRegistrations;
