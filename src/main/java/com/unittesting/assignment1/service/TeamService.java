package com.unittesting.assignment1.service;

import com.unittesting.assignment1.entities.Team;

import java.util.List;

public interface TeamService {
  public List<Team> getAllTeams();

  public Team getTeamWithId(int id);

  public Team createTeam(Team team);

  public Team updateTeam(Team team, int id);

  public void deleteTeam(int id);
}
