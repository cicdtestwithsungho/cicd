module.exports = {
    "disableEmoji": false,
    "format": "{emoji}{type}{scope}: {subject}",
    "list": [
      "feat",
          "fix",
          "remove",
      "docs",
      "style",
      "chore",
      "refactor",
    ],
    "maxMessageLength": 64,
    "minMessageLength": 3,
    "questions": [
      "type",
      "subject",
      "body",
    ],
    "types": {
      "feat": {
        "description": "새로운 기능 추가",
        "emoji": "✨",
        "value": "feat"
      },
      "fix": {
        "description": "코드 수정",
        "emoji": "🔨",
        "value": "fix"
        },
      "remove": {
        "description": "코드 제거",
        "emoji": "🧹",
        "value": "remove"
      },
      "docs": {
        "description": "문서 작업",
        "emoji": "📄",
        "value": "docs"
      },
      "style": {
        "description": "코드에 영향을 주지 않는 디자인 및 포맷 변경사항",
        "emoji": "🎨",
        "value": "style"
      },
      "chore": {
        "description": "빌드 관련 파일 수정 및 설정 변경",
        "emoji": "🧵",
        "value": "chore"
      },
      "refactor": {
        "description": "성능 개선 및 리팩토링",
        "emoji": "🌊",
        "value": "refactor"
      }
    }
  }