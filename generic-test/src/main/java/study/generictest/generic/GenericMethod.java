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
        List objects = new ArrayList<>();
        if (clazz.isAssignableFrom(TeamDto.class)) { // HERE
            objects.add(new TeamDto(str));
        }
        else if (clazz.isAssignableFrom(MemberDto.class)) {
            objects.add(new MemberDto(str));
        }
        else {
            objects.add(new Object());
        }
        return objects;
    }
}
