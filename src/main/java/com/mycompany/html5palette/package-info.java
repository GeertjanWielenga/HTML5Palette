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
            itemid = "Color",
            icon16 = "com/mycompany/html5palette/icons/color.png",
            icon32 = "com/mycompany/html5palette/icons/color32.png",
            body = "<label for=\"color\">Color: </label>\n"
            + "<input id=\"color\" type=\"color\" />",
            tooltip = "<input type=\"color\" />",
            name = "Color"),
    @PaletteItemRegistration(
            paletteid = "HTMLPalette",
            category = "HTML5",
            itemid = "Date",
            icon16 = "com/mycompany/html5palette/icons/date.png",
            icon32 = "com/mycompany/html5palette/icons/date32.png",
            body = "<label for=\"dob\">Date of Birth: </label>\n"
            + "<input id=\"dob\" type=\"date\" />",
            tooltip = "<input type=\"date\" />",
            name = "Date"),
    @PaletteItemRegistration(
            paletteid = "HTMLPalette",
            category = "HTML5",
            itemid = "E-Mail",
            icon16 = "com/mycompany/html5palette/icons/email.png",
            icon32 = "com/mycompany/html5palette/icons/email32.png",
            body = "<form>\n"
            + "<label for=\"email\">What is your e-mail address: </label>\n"
            + "<input id=\"email\" type=\"email\" required />\n"
            + "<input type=\"submit\" value=\"Submit\"/> \n"
            + "</form>",
            tooltip = "<input type=\"email\" required />",
            name = "E-Mail"),
    @PaletteItemRegistration(
            paletteid = "HTMLPalette",
            category = "HTML5",
            itemid = "Range",
            icon16 = "com/mycompany/html5palette/icons/range.png",
            icon32 = "com/mycompany/html5palette/icons/range32.png",
            body = "<label for=myRange>Volume:</label>\n"
            + "<input type=range \n"
            + "       min=0 \n"
            + "       max=100 \n"
            + "       value=50 \n"
            + "       id=myRange \n"
            + "       step=1\n"
            + "       list=volsettings\n"
            + "       oninput=\"outputUpdate(value)\">\n"
            + "<datalist id=volsettings>\n"
            + "    <option>0</option>\n"
            + "    <option>20</option>\n"
            + "    <option>40</option>\n"
            + "    <option>60</option>\n"
            + "    <option>80</option>\n"
            + "    <option>100</option>\n"
            + "</datalist>\n"
            + "<output for=myRange id=volume>50</output>\n"
            + "<script>\n"
            + "    function outputUpdate(vol) {\n"
            + "        document.querySelector('#volume').value = vol;\n"
            + "    }\n"
            + "</script>",
            tooltip = "<input type=\"range\" />",
            name = "Range"),
    @PaletteItemRegistration(
            paletteid = "HTMLPalette",
            category = "HTML5",
            itemid = "Required",
            icon16 = "com/mycompany/html5palette/icons/required.png",
            icon32 = "com/mycompany/html5palette/icons/required32.png",
            body = "<form>\n"
            + "<label for=\"movie\">What is your favorite movie : </label>\n"
            + "<input name=\"movie\" type=\"text\" required />\n"
            + "<input type=\"submit\" value=\"Submit\"/> \n"
            + "</form>",
            tooltip = "<input type=\"text\" required />",
            name = "Required"),
    @PaletteItemRegistration(
            paletteid = "HTMLPalette",
            category = "HTML5",
            itemid = "DataList",
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
