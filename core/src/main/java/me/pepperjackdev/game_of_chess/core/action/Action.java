package me.pepperjackdev.game_of_chess.core.action;

public sealed interface Action
    permits MoveAction, DrawAction {}
