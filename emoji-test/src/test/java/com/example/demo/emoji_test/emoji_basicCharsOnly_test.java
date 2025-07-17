package com.example.demo.emoji_test;

import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

public class emoji_basicCharsOnly_test {

    @Test
    void removeEmoji_test() {

        String[] helloList = {
                "안녕하세요",       // Korean
                "Hello",          // English
                "こんにちは",      // Japanese
                "你好",           // Chinese Simplified
                "你好",           // Chinese Traditional
                "Hola",           // Spanish
                "Bonjour",        // French
                "Hallo",          // German
                "Здравствуйте",   // Russian
                "مرحباً",         // Arabic
                "नमस्ते",          // Hindi
                "Ciao",           // Italian
                "Olá",            // Portuguese
                "Xin chào",       // Vietnamese
                "สวัสดี",          // Thai
                "Halo",           // Indonesian
                "Hej",            // Swedish
                "Salve",          // Latin
                "Hei",            // Norwegian
                "Ahoj",           // Czech
                "שלום",           // Hebrew
                "नमस्कार",          // Marathi
                "Selamat",        // Malay
                "Kamusta",        // Filipino
                "Sziasztok",      // Hungarian (plural)
                "Szia",           // Hungarian (informal)
                "Goddag",         // Danish
                "Salaam",         // Persian (Farsi)
                "Saluton",        // Esperanto
                "Tere",           // Estonian
                "Labas",          // Lithuanian
                "Dzień dobry",    // Polish
                "Salut",          // Romanian
                "Здраво",          // Macedonian
                "Merhaba",        // Turkish
                "Sannu",          // Hausa
                "Nde-ewo",        // Igbo
                "Mhoro",          // Shona
                "Molo",           // Xhosa
                "Bula",           // Fijian
                "Sawubona",       // Zulu
                "Hallo",          // Afrikaans
                "Dia dhuit",      // Irish
                "Bună ziua",      // Romanian
                "Sveiki",         // Latvian
                "Здравейте",       // Bulgarian
                "Salam",          // Azerbaijani
                "Kam na ma",      // Burmese
                "Habari",         // Swahili
                "Moïen",          // Luxembourgish
                "Hej",            // Faroese
                "Aloha",          // Hawaiian
                "Kumusta",        // Tagalog (Filipino)
                "Selam",          // Amharic
                "Namaste",        // Nepali
                "Vanakkam",       // Tamil
                "Namaskara",      // Kannada
                "Sat Sri Akal",   // Punjabi
                "Asalaam alaikum", // Urdu
                "~!@#$%^&*(){}[]<>+-/|\\'\",.:;",
        };


        String[] list = helloList;

        for (String emojiString : list) {
            String removeResult = basicCharsOnly(emojiString);
            System.out.println();
            System.out.println("before : " + emojiString);
            System.out.println("after  : " + removeResult);
//            assertThat(removeResult).isEmpty();
        }
    }

    public static String basicCharsOnly(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }
//        return text.replaceAll("[^\\p{IsHangul}\\p{IsLatin}\\p{IsDigit}\\s.,!?;:()\\[\\]{}\"'-]", "");
        return text.replaceAll("[^\\p{IsHangul}\\p{IsLatin}\\p{IsDigit}]", "");
    }
}
