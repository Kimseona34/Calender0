@Service
public class ScheduleService {

    @Inject
    private ScheduleDAO dao;

    public List<ScheduleDTO> showSchedule() throws Exception {
        return dao.showSchedule();
    }

    public void addSchedule(ScheduleDTO dto) throws Exception{
        dao.addSchedule(dto);

    }
}
