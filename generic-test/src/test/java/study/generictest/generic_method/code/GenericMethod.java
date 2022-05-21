package study.generictest.generic_method.code;

import study.generictest.dto.MemberDto;
import study.generictest.dto.TeamDto;

public class GenericMethod {

    public <T> T getValue(String str, Class<T> clazz) { // HERE
        Object object = null;
        if (clazz.isAssignableFrom(TeamDto.class)) { // HERE
            object = new TeamDto(str);
        }
        else if (clazz.isAssignableFrom(MemberDto.class)) { // HERE
            object = new MemberDto(str);
        }
        else {
            object = new Object();
        }
        return clazz.cast(object); // HERE
    }
}
