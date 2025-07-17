package com.example.demo.emoji_test;

import com.example.demo.EmojiDto;
import org.junit.jupiter.api.Test;

public class emoji_4byte_test {

    @Test
    void removeEmoji_test() {

        String[] emojiStringList = {

                // 1~2바이트 이모지 그룹1 (단순 특수기호, 체크/별표/삼각형 등)
                "★☆✓✔✘✖✳❇‼⁉※〒",

                // 1~2바이트 이모지 그룹2 (심볼, 박스, 음표 등 – 시각 강조용)
                "■□▲▼◆◇▶◀♬♪♩♫♭♯",

                // 3바이트 이모지 그룹1 (기본 UI용 상징 – 이메일, 전화, 날씨, 주의 등)
                "✉☎☏☀☁☂☃☔⚡☕⏰⌛⌚⚠⚠️☠",

                // 3바이트 이모지 그룹2 (기본 하트, 화살표, 기타 정보 마크)
                "❤❣💢💬💭💤➕➖➗✔️❌✅🔺🔻🔸🔹",

                // 4바이트 이모지 그룹1 (피드백/반응 – 얼굴, 손 제스처 등)
                "😀😁😂🤣😃😄😅😆😉😊😋😎😍😘🥰🙂🤗🤔😐😶",
                "👍👎🙏👏🙌🖐️✋🤚👌✌️🤞🤙🤟🤘",

                // 4바이트 이모지 그룹2 (실무 표현 – 알림, 경고, 정보 등)
                "📢📣🔔🔕🚨📣🆗🆘🆙🆒🆓🆕🆖🅿️🈁🈯️💡",

                // 4바이트 이모지 그룹3 (마케팅/공지 – 선물, 파티, 배너용)
                "🎁🎈🎉🎊🎂🎀🎆🎇🎄🎃🎋🪅✨💝💘",

                // 4바이트 이모지 그룹4 (상태/작업 진행 – 시간, 캘린더, 체크)
                "🕒🕐🕙🕛⏰⏳⌛📅📆📝✏️✅🔄🔃🔁",

                // 4바이트 이모지 그룹5 (금융/비즈니스 – 돈, 카드, 화폐, 차트 등)
                "💰💳💲💸📈📉📊💹🪙💷💶💴💵",

                // 4바이트 이모지 그룹6 (음식/휴식 – 카페, 음식 아이콘)
                "☕🍰🍩🍔🍟🍕🌭🥪🍱🍣🍛🥗🍜🍙🍚🍞",

                // 4바이트 이모지 그룹7 (이동수단/날씨/여행 – 위치, 교통)
                "🚗🚕🚙🚌🚎🚓🚑🚒🚨🚀✈️🛫🛬🛳⛴🌧️🌤️🌦️",

                // 4바이트 이모지 그룹8 (사용자 아바타용 – 사람/직업 이모지)
                "👨👩🧑👧👦👶🧒👵👴🧓👮‍♀️👮‍♂️👨‍⚕️👩‍⚕️👨‍🏫👩‍🏫",

                // 4바이트 이상 이모지 그룹1 (ZWJ 조합 – 가족, 직업)
                "👨‍👩‍👧‍👦👨‍👨‍👧‍👧👩‍👩‍👦‍👦👨‍💻👩‍💻👨‍🚀👩‍🚀👨‍🏫👩‍🏫",

                // 4바이트 이상 이모지 그룹2 (국기 및 지역 플래그)
                "🇰🇷🇺🇸🇯🇵🇨🇳🇬🇧🇩🇪🇫🇷🇮🇹🇪🇸🇧🇷🇨🇦🇦🇺🇷🇺🇸🇬",

                "한글123abc,.!?'\"~@#$%^&*(){}[]<>+-/_=\\|"
        };


//        String[] list = EmojiDto.emojiStringList;
        String[] list = emojiStringList;

        for (String emojiString : list) {
//            String removeResult = removeAllEmojis(emojiString);
            String removeResult = keepBasicCharsOnly(emojiString);
            System.out.println();
            System.out.println("before : " + emojiString);
            System.out.println("after  : " + removeResult);
//            assertThat(removeResult).isEmpty();
        }
    }

    public static String keepBasicCharsOnly(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }
        return text.replaceAll("[^\\p{IsHangul}\\p{IsLatin}\\p{IsDigit}\\s.,!?;:()\\[\\]{}\"'-]", "");
    }

    public static String removeAllEmojis(String input) {
        return input.replaceAll("[\\p{InEmoticons}\\p{InDingbats}\\p{InTransportAndMapSymbols}" +
                "\\p{InMiscellaneousSymbolsAndPictographs}\\p{InSupplementalSymbolsAndPictographs}" +
//                "\\p{InMiscellaneousSymbols}\\p{InSymbolsAndPictographsExtendedA}" +
                "\\x{1F1E6}-\\x{1F1FF}" +  // 국기
                "\\x{2700}-\\x{27BF}" +    // 기타
                "\\x{1F900}-\\x{1F9FF}" +  // Supplemental
                "\\x{1FA70}-\\x{1FAFF}" +  // Extended A
                "\\x{1F300}-\\x{1F5FF}" +  // Misc Symbols
                "\\x{1F600}-\\x{1F64F}" +  // 얼굴 이모지
                "\\x{1F680}-\\x{1F6FF}" +  // 운송/지도
                "\\x{1F700}-\\x{1F77F}" +  // Alchemical
                "\\x{1F780}-\\x{1F7FF}" +  // Geometric
                "\\x{1F800}-\\x{1F8FF}" +  // Supplemental arrows
                "\\x{1F900}-\\x{1F9FF}" +  // Supplemental symbols and pictographs
                "\\x{1FA00}-\\x{1FA6F}" +  // Chess symbols
                "\\x{1FA70}-\\x{1FAFF}" +  // Extended A
                "\\x{1FB00}-\\x{1FBFF}" +  // Extended B
                "\\x{FE0F}" +              // Variation Selector-16
                "]", "");
    }


    @Test
    void test2() {
        String str = "❤️🧡💛💚💙💜🖤🤍🤎💔❣️💕💞💓💗💖💘💝💟";
        System.out.println("str = " + str);
    }
}
