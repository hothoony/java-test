package com.example.demo;

public class EmojiDto {

    public static String[] emojiStringList = {
            // 😀 얼굴 이모지 (Smileys & Emotion)
            "😀😃😄😁😆😅😂🤣😊😇🙂🙃😉😌😍🥰😘😗😙😚😋😛😝😜🤪🤨🧐🤓😎🥸🤩🥳😏😒😞😔😟😕🙁☹️😣😖😫😩🥺😢😭😤😠😡🤬🤯😳🥵🥶😱😨😰😥😓🤗🤔🤭🤫🤥😶😐😑😬🙄😯😦😧😮😲🥱😴🤤😪😵🤐🥴🤢🤮🤧😷🤒🤕🤑😈👿👹👺💀👻👽👾🤖🎃😺😸😹😻😼😽🙀😿😾",

            // 🖐 사람 손 & 제스처 (People & Body)
            "👋🤚🖐✋🖖👌🤌🤏✌️🤞🫰🤟🤘🤙🫵🖕✊👊🤛🤜👏🫶👐🤲🤝🙏✍️💅🤳💪🦾🦵🦿🦶👂🦻👃🧠🫀🫁🦷🦴👀👁️👅👄🫦",

            // 👩‍🦰 인물 (Individual People)
            "🧔👶🧒👦👧🧑👱👨👩🧓👴👵🙍🙎🙅🙆💁🙋🧏🙇🤦🤷",

            // 🧑‍💼 직업 및 역할 (Person Role & Professions)
            "🧑‍⚕️🧑‍🎓🧑‍🏫🧑‍⚖️🧑‍🌾🧑‍🍳🧑‍🔧🧑‍🏭🧑‍💼🧑‍🔬🧑‍💻🧑‍🎤🧑‍🎨🧑‍✈️🧑‍🚀🧑‍🚒👮🕵️💂👷🫅👰🤵",

            // 🎒 복장 및 액세서리 (Clothing & Accessories)
            "🧳🎒👝👜👛💼👓🕶️🥽🥼🦺👔👕👖🧣🧤🧥🧦👗👘🥻🩱🩲🩳👙👚🩴👠👡👢👞👟🥿🧦🧢🎩",

            // 🎅 캐릭터/판타지 (Fantasy People & Costumes)
            "🧑‍🎄🎅🤶🦸🦹🧙🧚🧛🧜🧝🧞🧟👼",

            // 🚶 사람 활동 및 동작 (Activities)
            "🧍🧎🚶🏃💃🕺🕴️👯🧖🧘👭👫👬👨‍👩‍👦👨‍👩‍👧‍👦👨‍👨‍👧‍👧👩‍👧‍👧",

            // 🧵 물건 - 일상 및 장비 (Objects & Tools)
            "🧳🌂☂️🧵🪡🧶🪢🎽🥋🥊🥅⛳⛸️🥌🛷🛹🎿⛷️🏂🪂🏋️🤼🤸⛹️🤺🤾🧘🏄🏇🏊🤽🚣🧗🧖🚴🚵🤹",

            // 🍎 음식 & 음료 (Food & Drink)
            "🧃🧉🧊🥥🥑🍍🍌🍉🍊🍋🍓🫐🥭🍎🍏🍐🍑🍒🥝🍅🫒🥦🥬🥒🌶️🌽🥕🫑🧄🧅🥔🍠🫘🌰🧇🥞🧈🍳🧂🥩🥓🍗🍖🦴🦞🦐🦑🍤🥪🌮🌯🥙🧆🥚🍕🍔🍟🌭🥗🥘🍝🍜🍲🍛🍣🍱🥟🍢🍡🍧🍨🍦🥧🧁🍰🎂🍮🍭🍬🍫🍿🧋🧃🧉🍺🍻🥂🍷🥃🍸🍹🧊🥤🧊🍼",

            // 🚗 교통수단 및 차량 (Transport)
            "🚗🚕🚙🚌🚎🏎️🚓🚑🚒🚐🚚🚛🚜🛻🚲🛴🛵🏍️🛺🚨🚔🚍🛞",

            // 🔧 도구 및 장비 (Tools & Household)
            "🛠️🧰🔩⚙️🧲🪛🪚🔧🔨⛏️⚒️🪓🧱🪨🪵🛢️⛽🧯🚿🛁🛀🧼🪥🧽🧴🪒🚽🚪🪞🪟🛏️🛋️🪑🚪",

            // 🏠 건물 및 장소 (Places & Buildings)
            "🏠🏡🏘️🏗️🏢🏬🏣🏤🏥🏦🏨🏪🏫🏛️🏰🗼🗽",

            // 🎉 파티 및 축하 (Celebration & Event)
            "🎉🎊🎈🎂🎁🎀🪅🪩",

            // 🎵 음악 및 소리 (Sound & Music)
            "🎧🎼🎹🥁🎷🎺🎸🪕🪗🔔🛎️🎤📢📣📯📻",

            // 🛐 종교 및 상징 (Symbols & Religion)
            "🧿✝️☪️🕉️☸️🔯✡️🕎☯️☦️🛐⛎",

            // ♈ 별자리 및 기호 (Astrological & Signs)
            "♈♉♊♋♌♍♎♏♐♑♒♓",

            // 🆘 알파벳 & 기호 (Text & Enclosed)
            "🆔⚛️🉑☢️☣️📴📳🈶🈚🈸🈺🈷️✴️🆚🉐㊙️㊗️🈴🈵🈹🈲🅰️🅱️🆎🆑🅾️🆘",

            // ❤️ 하트 및 사랑 (Love & Heart)
            "❤️🧡💛💚💙💜🖤🤍🤎💔❣️💕💞💓💗💖💘💝💟",

            // 🏳️ 깃발 (Flags)
            "🇰🇷🇺🇸🇯🇵🇨🇳🇬🇧🇩🇪🇫🇷🇮🇹🇪🇸🇧🇷🇷🇺🇮🇳🏳️🏴🏁🚩🏳️‍🌈🏳️‍⚧️",

            // 🔣 기호형 이모지
            "🔠🔡🔢🔣🔤🅰️🆎🆑🆒🆓ℹ️🆔🆕🆖🅿️🆗🆘🆙🆚"
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
