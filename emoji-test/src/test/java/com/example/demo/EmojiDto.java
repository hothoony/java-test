package com.example.demo;

public class EmojiDto {

    public static String[] emojiStringList = {

            // 3 바이트, Symbols (단일 문자 하트, 별 등)
            "❤️❣️✴️✳️☀️☁️☂️☃️⭐️✂️",

            // 3 바이트, Transport & Map Symbols
            "✈️⛴️⚓⛵⛽⛰️⛺🗻🗼",

            // 4 바이트, Smileys & Emotion
            "😀😃😄😁😆😅😂🤣😊😇🙂🙃😉😌😍😘😗😙😚",

            // 4 바이트, People & Body - 얼굴/손/몸
            "👋🤚🖐✋🖖👌🤌🤏✌️🤞🤟🤘🤙🫵🫱🫲🫳🫴👏🙌",

            // 4 바이트, Animals & Nature
            "🐶🐱🐭🐹🐰🦊🐻🐼🐨🐯🦁🐮🐷🐽🐸🐵🙈🙉🙊🐒",

            // 4 바이트, Food & Drink
            "🍎🍏🍊🍋🍌🍉🍇🍓🫐🍈🍒🍑🥭🍍🥥🥝🍅",

            // 4 바이트, Travel & Places - 자동차/교통
            "🚗🚕🚙🚌🚎🏎🚓🚑🚒🚐🚚🚛🚜🛻🚲🛴",

            // 4 바이트, Travel & Places - 건물
            "🏠🏡🏘🏚🏗🏭🏢🏬🏣🏤🏥🏦🏨🏪",

            // 4 바이트, Activities - 스포츠
            "⚽🏀🏈⚾🎾🏐🏉🥏🎱🏓🏸🥅⛳",

            // 4 바이트, Objects - 시계
            "🕐🕑🕒🕓🕔🕕🕖🕗🕘🕙🕚🕛",

            // 4 바이트, Symbols - 하트 계열
            "💔💖💗💓💞💕💘💝💟",

            // 6~8 바이트, Flags (국기 - 지역 코드 2개 조합)
            "🇰🇷🇺🇸🇯🇵🇨🇳🇫🇷🇩🇪🇬🇧🇪🇸🇮🇹🇷🇺🇨🇦",

            // 10~14 바이트 이상, ZWJ 시퀀스 (조합형 이모지)
            "🏳️‍🌈🏴‍☠️👨‍👩‍👧‍👦👩‍❤️‍💋‍👩👨‍❤️‍💋‍👨"
    };

    /*

        ✅ 주요 유니코드 범주 및 하위 범주
        표현식	설명	                        예시 문자
        \p{L}	Letter (문자)	            A, 가, Ж
        \p{Lu}	Uppercase Letter	        A, B, C
        \p{Ll}	Lowercase Letter	        a, b, c
        \p{Lt}	Titlecase Letter	        ǅ
        \p{Lm}	Modifier Letter	            ʰ, ˡ
        \p{Lo}	Other Letter	            가, あ
        \p{M}	Mark (결합 문자 등)          	̀ (grave accent)
        \p{Mn}	Non-spacing mark    	    ̃ , ̀
        \p{N}	Number (숫자)	            1, ②, Ⅷ
        \p{Nd}	Decimal Digit Number	    0–9
        \p{Nl}	Letter Number	            Ⅻ
        \p{No}	Other Number	            ², ¾
        \p{P}	Punctuation (구두점)	        !, ?, “ ”
        \p{Pc}	Connector punctuation	    _
        \p{Pd}	Dash punctuation	        – —
        \p{Ps}	Opening punctuation	        ( [ {
        \p{Pe}	Closing punctuation	        ) ] }
        \p{S}	Symbol (기호)	            $, %, +
        \p{Sm}	Math symbol	                +, =, ∑
        \p{Sc}	Currency symbol	            $, ₩, €
        \p{Sk}	Modifier symbol	            ˆ, ~
        \p{So}	Other symbol (이모지 포함)	    😃, ♠
        \p{Z}	Separator (공백 계열)	        스페이스, 줄바꿈
        \p{Zs}	Space Separator	            스페이스
        \p{Zl}	Line Separator	            U+2028
        \p{Zp}	Paragraph Separator	        U+2029
        \p{C}	Other (기타)	                제어문자, 서식문자
        \p{Cc}	Control (제어문자)	        \n, \t
        \p{Cf}	Format (서식)	            ZWSP
        \p{Cs}	Surrogate	                UTF-16 내부용
        \p{Co}	Private Use	                앱/폰트 전용 문자
        \p{Cn}	Not Assigned (할당 안됨)	    비어있는 코드포인트

     */

}
