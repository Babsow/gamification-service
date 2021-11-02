package microservices.book.gamification.service;

import microservices.book.gamification.domain.LeaderBoardRow;
import java.util.List;

public interface LeadBoardService {
  List<LeaderBoardRow> getCurrentLeaderBoard();
}
