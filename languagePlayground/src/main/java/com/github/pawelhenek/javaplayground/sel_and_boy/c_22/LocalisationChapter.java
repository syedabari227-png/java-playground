package com.github.pawelhenek.javaplayground.sel_and_boy.c_22;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.stream.Stream;

import static com.google.common.collect.Streams.stream;
import static java.lang.System.out;

/**
 * Covered classes
 *
 * @see java.util.Locale
 * @see java.util.Properties
 * @see java.util.Map
 * @see java.util.HashMap
 * @see java.util.ListResourceBundle
 * @see java.util.ResourceBundle
 * @see java.util.Hashtable
 *
 * https://www.baeldung.com/java-resourcebundle
 * http://tutorials.jenkov.com/java-internationalization/resourcebundle.html
 *
 */
public class LocalisationChapter {

    private final Locale loc_korean = Locale.KOREAN;
    private final Locale loc_korea = Locale.KOREA;

    private final Locale loc_german = Locale.GERMAN;
    private final Locale loc_germany = Locale.GERMANY;

    private final Locale loc_canada = Locale.CANADA;
    private final Locale loc_canada_french = Locale.CANADA_FRENCH;

    public static void main(String[] args) throws IOException {

        Locale.FilteringMode localFilteringMode1 = Locale.FilteringMode.AUTOSELECT_FILTERING;
        Locale.FilteringMode localFilteringMode2 = Locale.FilteringMode.EXTENDED_FILTERING;
        Locale.FilteringMode localFilteringMode3 = Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        Locale.FilteringMode localFilteringMode4 = Locale.FilteringMode.MAP_EXTENDED_RANGES;
        Locale.FilteringMode localFilteringMode5 = Locale.FilteringMode.REJECT_EXTENDED_RANGES;

        Locale.Category localeCategoryDisplay = Locale.Category.DISPLAY;
        Locale.Category localeCategoryFormat = Locale.Category.FORMAT;

        Locale.IsoCountryCode localeCountryCode1 = Locale.IsoCountryCode.PART1_ALPHA2;
        Locale.IsoCountryCode localeCountryCode2 = Locale.IsoCountryCode.PART1_ALPHA3;
        Locale.IsoCountryCode localeCountryCode3 = Locale.IsoCountryCode.PART3;

        out.println("Locale#getDefault: " + Locale.getDefault());
        out.println("Locale#getAvailableLocales: " + Stream.of(Locale.getAvailableLocales()).map(Locale::toString).reduce(String::concat));
        out.println("Locale#getISOCountries: " + Stream.of(Locale.getISOCountries()).reduce(String::concat));
        out.println("Locale#getISOLanguages: " + Stream.of(Locale.getISOLanguages()).reduce(String::concat));

        Locale loc_pl = new Locale("pl");
        Locale loc_pl_PL = new Locale("pl", "PL");

        Locale loc = new Locale.Builder()
                .setLanguage("polish")
                .setLanguageTag("pl")
                //.setRegion("silesia")
                .build();

        out.println("Locale.Builder: " + loc);

        Locale.setDefault(Locale.Category.DISPLAY, loc);
        out.println("New locale default: " + Locale.getDefault());

        Properties props = new Properties(); // Properties extends Hashtable<Object,Object>
        props.put("a", 1);
        props.put("b", 2);

        out.println("Properties#keySet: " + props.keySet().stream().map(Object::toString).reduce(String::concat));
        out.println("Properties#propertyNames: " + stream(props.propertyNames().asIterator()).map(Object::toString).reduce(String::concat));

        out.println("Properties#get: " + props.get("a"));
        out.println("Properties#getProperty: " + props.getProperty("b"));
        out.println("Properties#getProperty: " + props.getProperty("c"));
        //System.out.println("Properties#getProperty: " + props.getProperty("c", -1)); // do not compile
        out.println("Properties#getProperty: " + props.getProperty("c", "-2"));
        out.println("Properties#getOrDefault: " + props.getOrDefault("c", -3));

        props = new Properties();
        props.load(LocalisationChapter.class.getClassLoader().getResourceAsStream("properties1.properties")); // potential java.io.IOException

        out.println("Properties#getProperty: "+ props.getProperty("mystery"));
        out.println("Properties#getProperty: " + props.getProperty("more"));

        out.println("Properties#values#size: " + props.values().size());

        FileWriter fw = new FileWriter("languagePlayground/target/output.properties");
        props.store(fw, "this is a comment");
        fw.close();

        ResourceBundle rb = ResourceBundle.getBundle("baseBundle");
        out.println("ResourceBundle#containsKey: " + rb.containsKey("prop1"));
        out.println("ResourceBundle#getKeys: " + rb.getKeys());
        out.println("ResourceBundle#getString: " + rb.getString("prop1"));
        out.println("ResourceBundle#getLocale: " + rb.getLocale());
        out.println("ResourceBundle#getBaseBundleName: " + rb.getBaseBundleName());

        ResourceBundle rb_pl = ResourceBundle.getBundle("baseBundle", loc_pl_PL);
        out.println("ResourceBundle#containsKey: " + rb_pl.containsKey("prop1"));
        out.println("ResourceBundle#getString: " + rb_pl.getString("prop1"));
        out.println("ResourceBundle#getKeys: " + rb_pl.getKeys());
        out.println("ResourceBundle#getLocale: " + rb_pl.getLocale());
        out.println("ResourceBundle#getBaseBundleName: " + rb_pl.getBaseBundleName());

        ResourceBundle classBased_pl = ResourceBundle.getBundle("com.github.pawelhenek.javaplayground.sel_and_boy.c_22.OwnPropertiesResourceBundle", loc_pl);
        out.println("ResourceBundle#containsKey: " + classBased_pl.containsKey("ąę"));
        out.println("ResourceBundle#getString: " + classBased_pl.getString("ąę"));
        out.println("ResourceBundle#getKeys: " + classBased_pl.getKeys());
        out.println("ResourceBundle#getLocale: " + classBased_pl.getLocale());
        out.println("ResourceBundle#getBaseBundleName: " + classBased_pl.getBaseBundleName());

        ResourceBundle nonBundle = ResourceBundle.getBundle("nonBundle", new Locale("pl", "PL")); // potential java.util.MissingResourceException
    }
}
