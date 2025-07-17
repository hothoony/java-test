package com.example.demo.emoji_test;

import org.junit.jupiter.api.Test;

public class emoji_test1 {

    @Test
    void removeEmoji_test() {

        String[] emojiStringList = {
                "📌 제목 다기능 음식 합성기 📝 부제 미래형 조리의 혁신 👤 발표자 [너의 이름 입력] 배경 추천.pptx",
                "💡 프로젝트 요약 ✨ 팀원 👩‍💻👨‍🔧 기획 🔍 개발 📦 완료 🎉",
                "😀😁😂🤣😃😄😅😆😉😊😋😎😍😘",  // 기본 얼굴 이모지
                "👨‍👩‍👧‍👦 가족 이모지 포함",         // ZWJ(Zero Width Joiner)로 구성된 이모지
                "❤️🧡💛💚💙💜🖤🤍🤎💔❣️💕💞",     // 하트 계열 이모지
                "✅❌⚠️🔒🔓⚡️🔥💥🚀",               // 상태, 알림, 경고 이모지
                "🎵🎶🎧🎤🎹🥁🎷🎺🎸",               // 음악 관련 이모지
                "🏃‍♂️🏃‍♀️🚴‍♂️🏋️‍♀️🤸‍♂️⛹️‍♂️",       // 스포츠, 동작 이모지
                "🍎🍔🍣🍕🌮🍩🍪🎂🍰",               // 음식 이모지
                "🐶🐱🐭🐹🐰🦊🐻🐼🐨",               // 동물 이모지
                "🌍🌎🌏🪐⭐️🌟🌙☀️⚡️",             // 자연 및 별 관련 이모지
                "텍스트😊중간에❤️특수문자✨포함",     // 일반 텍스트 중간 이모지
                "ZWJ/ZWSP 포함: A\u200B\u200D\u2060B", // 제로폭 공백 등 특수 제어문자 포함
                "🏳️‍🌈🎗️🔠🔡🔢🔣🔤",               // 기호형 이모지
                "🎉 축하합니다! 🥳 당신은 1등입니다! 🏆", // 축하 메시지
                // 😀 이모지 (기본 얼굴 - Smileys & Emotion)
                "😀😁😂🤣😃😄😅😆😉😊😋😎😍😘🥰😗😙😚🙂🤗🤔",

                // 👨‍👩‍👧‍👦 조합형 이모지 (사람 조합 - ZWJ 포함)
                "👨‍👩‍👧‍👦👩‍👩‍👧‍👦👨‍👨‍👧‍👦👩‍👩‍👧👨‍👩‍👦",

                // 🧑‍🔬 직업 이모지 (ZWJ + 속성 조합)
                "🧑‍⚕️🧑‍🎓🧑‍🏫🧑‍⚖️🧑‍🌾🧑‍🍳🧑‍🔧🧑‍🏭🧑‍💼🧑‍🔬🧑‍🎤🧑‍🎨",

                // ❤️ 하트 (Symbols - 하트, 상태)
                "❤️🧡💛💚💙💜🖤🤍🤎💔❣️💕💞💓💗💖💘💝💟",

                // ✨ 심볼/상태 이모지
                "✅❌⚠️⚡️🔥💥☀️🌙⭐️🌟🌈☁️☔️⛈️🌪️",

                // 👏 사람 동작 이모지 (People & Body)
                "👋🤚🖐✋🖖👌🤌🤏✌️🤞🤟🤘🤙🫶🫲🫱",

                // 🏃 스포츠/활동 이모지
                "🏃‍♂️🏃‍♀️🏋️‍♂️🏋️‍♀️🤸‍♂️🤸‍♀️🚴‍♂️🚴‍♀️🏊‍♂️🏊‍♀️",

                // 🐶 동물/자연
                "🐶🐱🐭🐹🐰🦊🐻🐼🐨🐯🦁🐮🐷🐸🐵🙈🙉🙊",

                // 🍔 음식/음료
                "🍎🍊🍉🍇🍓🍒🍑🥭🍍🥥🥝🍅🍆🥑🥦🥬🌽🥕🍔🍕🌮🍣🍱🍛",

                // 🚌 교통/장소
                "🚗🚕🚙🚌🚎🏎️🚓🚑🚒🚐🚚🚛🚜✈️🚀🛸🚁🚂🛳️⛴️",

                // 🎉 이벤트/파티
                "🎉🎊🎈🎁🎀🎇🎆🧨✨🎵🎶🎤🎧🎷🎸🎹🥁",

                // 🧩 객체/도구
                "💡🔦🕯️🧯🛢️🔋🔌💻🖥️🖨️🖱️🖲️⌨️📱📞☎️📟📠",

                // 🔣 기호형 이모지
                "🔠🔡🔢🔣🔤🅰️🆎🆑🆒🆓ℹ️🆔🆕🆖🅿️🆗🆘🆙🆚",

                // 🧿 상징/문화 이모지
                "🛐✝️☪️🕉️☸️✡️🔯🕎☯️☦️🛐🕋⛩️🕌⛪️🕍",

                // 🧬 과학/의학 이모지
                "🧬🦠🧫🧪💊💉🩸🩹🩺",

                // ♻️ 환경/기타
                "♻️♨️🛑🚫🚳🚭🚯🚱⚠️🚸⛔️🚷",

                // 🧠 신체/기관 이모지
                "🧠🫀🫁🦷🦴",

                // 🤖 로봇/기타 캐릭터
                "🤖👾👽👻💀☠️👹👺",

                // 🧙 캐릭터/판타지
                "🧙‍♂️🧝‍♀️🧛‍♂️🧞‍♂️🧜‍♀️🧚‍♂️🧟‍♀️🧌"
        };

        for (String emojiString : emojiStringList) {
            System.out.println();
            System.out.println("before : " + emojiString);
            System.out.println("after  : " + removeEmoji(emojiString));
        }
    }

    public static String removeEmoji(String str) {
        if (str == null) return null;

        // 이모지 범위 제거
        str = str.replaceAll("[\\p{So}]", "");

        // 플래그 이모지 제거 (2개의 regional indicator 조합)
        str = str.replaceAll("[\uD83C][\uDDE6-\uDDFF]", "");

        // 서식, 제어 문자 제거
        str = str.replaceAll("[\\p{Cf}\\p{Cntrl}\\p{C}]", "");

        // Variation Selector 제거
        str = str.replaceAll("[\\uFE00-\\uFE0F]", "");

        // ZWSP, ZWJ, WORD JOINER 제거
        str = str.replaceAll("[\\u200B-\\u200D\\u2060]", "");

        return str;
    }

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
