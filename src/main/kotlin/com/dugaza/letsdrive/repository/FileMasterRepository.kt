package com.dugaza.letsdrive.repository

import com.dugaza.letsdrive.entity.file.FileMaster
import org.springframework.data.jpa.repository.JpaRepository
import java.util.UUID

interface FileMasterRepository : JpaRepository<FileMaster, UUID>
