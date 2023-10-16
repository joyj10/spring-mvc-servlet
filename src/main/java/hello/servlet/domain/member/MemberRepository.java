package hello.servlet.domain.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * MemberRepository
 * <pre>
 * 동시성 문제가 고려 되어 있지 않음, 실무에서는 ConcurrentHashMap, AtomicLong 사용 고려
 * </pre>
 *
 * @version 1.0,
 */
public class MemberRepository {
    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;

    // single tone
    private static final MemberRepository instance = new MemberRepository();

    public static MemberRepository getInstance() {
        return instance;
    }

    private MemberRepository() {
    }

    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    public Member findById(Long id) {
        return store.get(id);
    }

    public List<Member> findAll() {
        // 이렇게 하는 이유는 밖에서 스토어에 대한 값을 건들 수 없게 하기 위해서
        // 단, 스토어 안에 있는 member 수정하면 수정이 됨, 스토어를 보호하기 위한 형태
        return new ArrayList<>(store.values());
    }

    // 테스트 에서만 사용할 예정
    public void clearStore() {
      store.clear();
    }


}
