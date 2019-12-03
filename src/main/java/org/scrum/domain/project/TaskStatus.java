package org.scrum.domain.project;

import javax.persistence.*;

public enum TaskStatus{
	IN_PROGRESS, BLOCKED, COMPLETE, SUSPENDED;
}
