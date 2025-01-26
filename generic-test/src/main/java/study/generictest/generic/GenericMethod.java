package study.generictest.generic;

import study.generictest.dto.MemberDto;
import study.generictest.dto.TeamDto;

import java.util.ArrayList;
import java.util.List;

public class GenericMethod {

    public <T> T getDto(String str, Class<T> clazz) { // HERE
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
    
    public <T> List<T> getDtoList(String str, Class<T> clazz) {
        List<T> list = new ArrayList<>();
        if (clazz.isAssignableFrom(TeamDto.class)) { // HERE
            list.add(clazz.cast(new TeamDto(str)));
        }
        else if (clazz.isAssignableFrom(MemberDto.class)) {
            list.add(clazz.cast(new MemberDto(str)));
        }
        else {
            list.add(clazz.cast(new Object()));
        }
        return list;
    }
}
