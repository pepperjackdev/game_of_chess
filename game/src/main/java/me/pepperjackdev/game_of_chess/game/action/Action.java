package me.pepperjackdev.game_of_chess.game.action;

public sealed interface Action
    permits MoveAction, DrawAction {}
