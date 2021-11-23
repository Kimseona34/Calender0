package Controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

@ResponseBody
@RequestMapping(value = "/showSchedule", method = RequestMethod.POST)
public Map<Object.Object> addSchedule(@ResponseBody ScheduleDTO dto) throws Exception{
    Map<Object.Object>map = new HashMap<Object.Object>();

    service.addSchedule(dto);

    return map;
}

@RequestMapping(value = "/schedule")
public String schedule(Model model)throws Exception {

    model.addAttribute("showSchedule", service.showSchedule());

    return "/schedule";
}

