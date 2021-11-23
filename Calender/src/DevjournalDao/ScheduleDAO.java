package DevjournalDao;

@Repository
public class ScheduleDAO {

    @Inject
    private SqlSession sqlSession;

    private static final String namespace = "com.management.dao.ScheduleDAO";

    public List<ScheduleDTO> showSchedule() throws Exception {
        return sqlSession.selectList(namespace + ".showSchedule");
    }

    public void addSchedule(ScheduleDTO dto) throws Exception {
        sqlSession.insert(namespace + ".addSchedule", dto);

    }

}