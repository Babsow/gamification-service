package microservices.book.gamification.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import microservices.book.gamification.domain.LeaderBoardRow;
import microservices.book.gamification.service.LeadBoardService;

@RestController
@RequestMapping("/leaders")
class LeaderBoardController {
      private final LeadBoardService leaderBoardService;
      
      public LeaderBoardController(final LeadBoardService
      leaderBoardService) {
        this.leaderBoardService = leaderBoardService;
      }
      @GetMapping
      public List<LeaderBoardRow> getLeaderBoard() {
          return leaderBoardService.getCurrentLeaderBoard();
    }
}